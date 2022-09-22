package IMTX2.Backend.Repository;

import IMTX2.Backend.Model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressDao extends CrudRepository<Address,Integer> {
}
