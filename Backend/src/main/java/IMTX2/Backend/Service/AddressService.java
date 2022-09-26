package IMTX2.Backend.Service;

import IMTX2.Backend.Repository.AddressDao;
import IMTX2.Backend.Repository.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@Transactional

public class AddressService {
    private AddressDao addressdao;
    @Autowired
    public AddressService (AddressDao addressdao) {
        this.addressdao = addressdao;
    }


}