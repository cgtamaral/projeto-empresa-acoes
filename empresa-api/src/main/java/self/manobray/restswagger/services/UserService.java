package self.manobray.restswagger.services;

import java.util.List;

import self.manobray.restswagger.domain.User;

public interface UserService {

	User getById(Long id);

    List<User> getAllUsers();

    User createNew(User user);

    User save(Long id, User user);

    User patch(Long id, User user);

    void deleteById(Long id);
}
