package IMTX2.Backend.Service;

import IMTX2.Backend.Repository.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional

public class CutomerService {
    private CustomerDao customerdao;
     @Autowired
     public CutomerService(CustomerDao customerdao) {
        this.customerdao = customerdao;
        }





}
