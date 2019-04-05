/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorio;

import crudbasico.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rodrigo
 */
public class RepositorioUser implements IRepositorio{

    List<User> usersList = new ArrayList<User>();
    
    @Override
    public boolean saveUser(User user) {
        try {
            usersList.add(user);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteUser(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> listUser() {
        return listUser();
    }

    @Override
    public boolean updateUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
