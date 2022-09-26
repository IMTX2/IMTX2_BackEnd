package IMTX2.Backend.Repository;

import IMTX2.Backend.Model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostDao extends CrudRepository<Post,Integer> {
}
