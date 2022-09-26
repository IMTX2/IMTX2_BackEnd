package IMTX2.Backend.Repository;

import IMTX2.Backend.Model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDao extends CrudRepository <Customer,Integer>{

}
