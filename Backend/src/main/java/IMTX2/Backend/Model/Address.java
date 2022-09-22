package IMTX2.Backend.Model;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table (name="address")
public class Address {
    @Id
    @Column(name="address_id")
    private int addressId;
    private String address;
    private String City;
    private String state;
    @Column(name="zip_code")
    private int zipCode;
    private String country;



}
