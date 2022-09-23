package IMTX2.Backend.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name="post")
public class Post {
   @Id
   @Column(name="post_id")
    private int postId;
  // @ManyToOne
  // @JoinColumn(name = "email", referencedColumnName = "customerID")
    private String email;
    private String msg;
    private String img;

}
