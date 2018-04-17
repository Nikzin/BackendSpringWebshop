package nz.webshop.models.Product;

public class Products {
    private Integer productId;
    private Integer quantity;

    public Products(Integer productId, Integer quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public Products() {
    }


    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
