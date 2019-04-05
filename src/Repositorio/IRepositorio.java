/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorio;
import crudbasico.User;
import java.util.List;

/**
 *
 * @author Rodrigo
 */
public interface IRepositorio {
    
    public boolean saveUser(User user);
    public boolean deleteUser(Long id);
    public List<User> listUser();
    public boolean updateUser(User user);
    
    
    
}
