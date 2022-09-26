package IMTX2.Backend.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table ( name="customer")

public class Customer {
    @Id
    private int customer_id;
   private String username;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @Column (name="first_name")

    private  String firstName;
    @Column (name="last_name")
    private String lastName;
    private String email;
    @Column (name="phone_number")
    private String phoneNumber;
    @Column(name="is_admin")
    private boolean isAdmin;




}
