package IMTX2.Backend.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table ( name="customer")

public class Customer {
    @Id
    private int ID;
    @Column (name="first_name")

    private  String firstName;
    @Column (name="last_name")
    private String lastName;
    private String email;
    @Column (name="phone_number")
    private String phoneNumber;



}
