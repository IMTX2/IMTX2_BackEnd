package IMTX2.Backend.Service;

import IMTX2.Backend.Repository.AddressDao;
import IMTX2.Backend.Repository.PostDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;




@Service
@Transactional

public class PostService {
    private PostDao postDao;
    @Autowired
    public PostService (PostDao postDao) {
        this.postDao = postDao;
    }


}
