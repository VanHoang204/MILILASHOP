package com.example.datn_team_ae.API;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

// Giả lập một lớp DTO (Data Transfer Object) cho sản phẩm
// Trong thực tế, bạn sẽ ánh xạ từ bảng SQL Server vào lớp này
class Product {
    private String name;
    private String description;
    private double price;
    private String sku; // Mã sản phẩm
    private List<String> sizes; // Kích cỡ
    private String material; // Chất liệu
    private String category; // Danh mục

    public Product(String name, String description, double price, String sku, List<String> sizes, String material, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.sku = sku;
        this.sizes = sizes;
        this.material = material;
        this.category = category;
    }

    // Getters
    public String getName() { return name; }
    public String getDescription() { return description; }
    public double getPrice() { return price; }
    public String getSku() { return sku; }
    public List<String> getSizes() { return sizes; }
    public String getMaterial() { return material; }
    public String getCategory() { return category; }

    // Phương thức để chuyển đổi thông tin sản phẩm thành chuỗi thân thiện với AI
    @Override
    public String toString() {
        return "Sản phẩm: " + name + " (Mã: " + sku + ")\n" +
                "Mô tả: " + description + "\n" +
                "Giá: " + String.format("%,.0f", price) + " VNĐ.\n" +
                "Kích cỡ: " + (sizes != null && !sizes.isEmpty() ? String.join(", ", sizes) : "Không xác định") + ".\n" +
                "Chất liệu: " + (material != null && !material.isEmpty() ? material : "Không xác định") + ".\n" +
                "Danh mục: " + (category != null && !category.isEmpty() ? category : "Không xác định") + ".";
    }
}

// Lớp dịch vụ để xử lý logic liên quan đến sản phẩm
// Trong thực tế, lớp này sẽ kết nối với SQL Server (sử dụng JPA/Hibernate hoặc JDBC)
// để truy vấn dữ liệu sản phẩm
@Service
class ProductService {

    // Đây là dữ liệu sản phẩm giả lập, đã được mở rộng.
    // Trong môi trường thực tế, bạn sẽ lấy dữ liệu từ SQL Server.
    private final List<Product> mockProducts = Arrays.asList(
            new Product("Đầm công sở thanh lịch", "Đầm thiết kế dáng A, chất liệu voan cao cấp, phù hợp đi làm và đi tiệc nhẹ. Có họa tiết hoa tinh tế.", 750000.0, "MIN_D001", Arrays.asList("S", "M", "L"), "Voan", "Đầm"),
            new Product("Áo sơ mi lụa mềm mại", "Áo sơ mi lụa tơ tằm, màu trắng ngà, thiết kế cổ đức, tay dài, dễ phối đồ với chân váy hoặc quần âu.", 480000.0, "MIN_SM002", Arrays.asList("S", "M", "L", "XL"), "Lụa tơ tằm", "Áo sơ mi"),
            new Product("Quần âu ống đứng", "Quần âu dáng đứng, chất liệu kate cao cấp, co giãn nhẹ, màu đen cơ bản. Phù hợp cho mọi vóc dáng, tạo vẻ ngoài chuyên nghiệp.", 620000.0, "MIN_QA003", Arrays.asList("26", "27", "28", "29", "30"), "Kate", "Quần âu"),
            new Product("Chân váy bút chì", "Chân váy bút chì dáng dài qua gối, chất liệu cotton pha, màu xanh navy, xẻ tà sau tiện lợi khi di chuyển.", 550000.0, "MIN_CV004", Arrays.asList("S", "M", "L"), "Cotton pha", "Chân váy"),
            new Product("Bộ vest nữ công sở", "Bộ vest gồm áo blazer và quần âu đồng bộ, màu be trang nhã, form slimfit tôn dáng. Chất liệu cao cấp, ít nhăn, phù hợp cho các sự kiện quan trọng.", 1800000.0, "MIN_VT005", Arrays.asList("S", "M", "L"), "Vải tổng hợp cao cấp", "Bộ vest"),
            new Product("Đầm xòe họa tiết", "Đầm xòe nhẹ nhàng, họa tiết chấm bi nhỏ, chất liệu chiffon bay bổng. Thích hợp cho những ngày làm việc thoải mái hoặc dạo phố.", 800000.0, "MIN_D006", Arrays.asList("S", "M", "L"), "Chiffon", "Đầm"),
            new Product("Áo kiểu peplum", "Áo kiểu peplum màu hồng pastel, tay lỡ, giúp che khuyết điểm vòng eo hiệu quả, tạo dáng đồng hồ cát.", 520000.0, "MIN_AK007", Arrays.asList("S", "M", "L"), "Vải voan phối ren", "Áo kiểu"),
            new Product("Quần culottes", "Quần culottes dáng rộng, lưng cao, chất liệu đũi thoáng mát. Màu trắng tinh khôi, mang lại vẻ thanh lịch, phóng khoáng.", 680000.0, "MIN_QC008", Arrays.asList("S", "M", "L"), "Đũi", "Quần"),
            new Product("Chân váy xếp ly midi", "Chân váy xếp ly dáng midi, màu nâu đất, chất liệu dày dặn, đứng form. Dễ phối với áo sơ mi hoặc áo len mỏng.", 590000.0, "MIN_CV009", Arrays.asList("Free size"), "Vải dạ", "Chân váy"),
            new Product("Set áo và chân váy", "Set đồ gồm áo croptop và chân váy xòe cùng tông màu xanh ngọc. Phong cách trẻ trung, năng động nhưng vẫn giữ được nét công sở.", 1100000.0, "MIN_ST010", Arrays.asList("S", "M", "L"), "Vải tuyết mưa", "Set đồ")
    );

    // Phương thức giả lập để lấy thông tin sản phẩm dựa trên truy vấn
    // Trong thực tế, bạn sẽ phân tích 'userQuery' để tạo câu lệnh SQL phù hợp
    public String getProductsForQuery(String userQuery) {
        StringBuilder relevantProducts = new StringBuilder();
        relevantProducts.append("Thông tin sản phẩm hiện có của Minlila để bạn tham khảo:\n");

        boolean found = false;
        // Logic tìm kiếm đơn giản: tìm các sản phẩm có tên hoặc mô tả chứa từ khóa trong userQuery
        for (Product product : mockProducts) {
            if (product.getName().toLowerCase().contains(userQuery.toLowerCase()) ||
                    product.getDescription().toLowerCase().contains(userQuery.toLowerCase()) ||
                    product.getCategory().toLowerCase().contains(userQuery.toLowerCase()) || // Tìm theo danh mục
                    userQuery.toLowerCase().contains(product.getCategory().toLowerCase()) // Nếu user hỏi về danh mục
            ) {
                relevantProducts.append("- ").append(product.toString()).append("\n");
                found = true;
            }
        }

        if (!found) {
            relevantProducts.append("Hiện tại không tìm thấy sản phẩm nào liên quan đến từ khóa bạn đã tìm. Vui lòng hỏi chi tiết hơn hoặc thử từ khóa khác.");
        }
        return relevantProducts.toString();
    }
}

@RestController
@RequestMapping("/api/chat")
@CrossOrigin(origins = "*")
public class GeminiController {

    @Value("${gemini.api.key:YOUR_API_KEY_HERE}")
    private String apiKey;

    // Tự động inject ProductService vào controller
    private final ProductService productService;

    // Constructor để Spring tự động inject ProductService
    public GeminiController(ProductService productService) {
        this.productService = productService;
    }

    private static final String GEMINI_BASE_URL = "https://generativelanguage.googleapis.com/v1beta/models/gemini-2.0-flash:generateContent";

    @PostMapping
    public ResponseEntity<Map<String, String>> chat(@RequestBody Map<String, String> payload) {
        try {
            String userMessage = payload.get("message");

            if (userMessage == null || userMessage.trim().isEmpty()) {
                return ResponseEntity.badRequest()
                        .body(Map.of("reply", "❌ Tin nhắn không được để trống."));
            }

            String geminiUrl = GEMINI_BASE_URL + "?key=" + apiKey;

            Map<String, Object> requestBody = new HashMap<>();
            List<Map<String, Object>> contentsList = new ArrayList<>();

            // 1. Hướng dẫn hệ thống (System Instruction)
            Map<String, String> systemInstructionPart = new HashMap<>();
            systemInstructionPart.put("text",
                    "Bạn là một AI tư vấn khách hàng cho thương hiệu thời trang nữ công sở Minlila. Nhiệm vụ của bạn là tư vấn về quần áo công sở nữ và các sản phẩm có trên website của Minlila. Khi được hỏi về thông tin liên hệ, hãy cung cấp số điện thoại 0123456789. Tuyệt đối không sử dụng bất kỳ định dạng markdown nào (ví dụ: **in đậm**, *in nghiêng*, `code`). Hãy giữ câu trả lời ngắn gọn, trực tiếp và đi thẳng vào vấn đề. Đảm bảo phản hồi của bạn thân thiện, chuyên nghiệp. Hãy luôn trả lời bằng tiếng Việt.");

            Map<String, Object> systemContent = new HashMap<>();
            systemContent.put("parts", new Object[]{systemInstructionPart});
            systemContent.put("role", "user");
            contentsList.add(systemContent);

            // 2. Lấy thông tin sản phẩm liên quan từ ProductService và thêm vào ngữ cảnh
            // Đây là bước quan trọng để AI có thông tin về sản phẩm từ SQL Server
            String productContext = productService.getProductsForQuery(userMessage);
            if (productContext != null && !productContext.isEmpty()) {
                Map<String, String> productContextPart = new HashMap<>();
                productContextPart.put("text", productContext);
                Map<String, Object> productContent = new HashMap<>();
                productContent.put("parts", new Object[]{productContextPart});
                productContent.put("role", "user"); // Vai trò 'user' để cung cấp thông tin
                contentsList.add(productContent);
            }

            // 3. Tin nhắn thực tế của người dùng
            Map<String, String> userMessagePart = new HashMap<>();
            userMessagePart.put("text", userMessage);

            Map<String, Object> userContent = new HashMap<>();
            userContent.put("parts", new Object[]{userMessagePart});
            userContent.put("role", "user");
            contentsList.add(userContent);

            requestBody.put("contents", contentsList);

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            HttpEntity<Map<String, Object>> entity = new HttpEntity<>(requestBody, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.exchange(
                    geminiUrl,
                    HttpMethod.POST,
                    entity,
                    String.class
            );

            String responseBody = response.getBody();
            System.out.println("Gemini Flash API response: " + responseBody);

            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(responseBody);

            if (root.has("candidates")) {
                JsonNode parts = root.path("candidates")
                        .path(0)
                        .path("content")
                        .path("parts");

                if (parts.isArray() && parts.size() > 0) {
                    String reply = parts.get(0).path("text").asText("Không có phản hồi từ AI.");
                    return ResponseEntity.ok(Map.of("reply", reply));
                }
            } else if (root.has("error")) {
                String errorMsg = root.path("error").path("message").asText("Lỗi không xác định.");
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body(Map.of("reply", "❌ Lỗi từ Gemini API: " + errorMsg));
            }

            return ResponseEntity.ok(Map.of("reply", "❌ AI không có phản hồi phù hợp."));

        } catch (HttpClientErrorException e) {
            System.err.println("HTTP Error: " + e.getStatusCode() + " - " + e.getResponseBodyAsString());
            return ResponseEntity.status(e.getStatusCode())
                    .body(Map.of("reply", "❌ Lỗi API: " + e.getMessage()));
        } catch (Exception e) {
            System.err.println("Error calling Gemini API: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("reply", "❌ Lỗi kết nối với AI service."));
        }
    }
}
