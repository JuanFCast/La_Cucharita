package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//Clase principal del model, porfavor aqui colocar todos los metodos referentes al restaurante
public class Restaurant {

	//Lista de Usuarios del Restaurante (Empleados y moderadores)
	private List<User> userList;
	private List<Dish> dishesAvailable;
	
	//Constructor
	public Restaurant() {
		userList = new ArrayList<User>();
		dishesAvailable = new ArrayList<Dish>();
		
		//Creacion de Usuarios administradores
		userList.add(new User("123", "Administrador", "123", "Administrador"));
		userList.add(new User("1151969753", "Juan Camilo Ramirez", "Urs43M1n0ris", "Administrador"));
		
		
	}
	
	
	
	
	
	
	public List<User> getUserList() {
		return userList;
	}




	public void setUserList(List<User> userList) {
		this.userList = userList;
	}





	public void createAccount(String id, String name, LocalDate birthday, String passwordfield) {
		User userAcc= new User(id, name, birthday, passwordfield);
		userList.add(userAcc);
		
	}
	
	
	
	
	
	/**
	 * Este metodo evalua si el usuario se encuentra registrado y sus datos coinciden para asi poder permitirle iniciar sesion
	 * Dise�ado por Juan Camilo
	 * */
	public boolean evaluate_If_User_Can_LogIn(String user, String password) {
		boolean confirmation = false;
		
		for(int i = 0; i < userList.size(); i++) {
			if((userList.get(i).getId().equals(user)) && (userList.get(i).getPassword().equals(password))) {
				confirmation = true;
			}
		}
		
		return confirmation;
	}
	
	
	
	
	
	public boolean add_New_Dish_In_The_Menu(String dishName, ArrayList<Ingredient> ingredients, double price) {
		if(dishesAvailable.add(new Dish(dishName, ingredients, price))) {
			return true;
		} else {
			return false;
		}
	}
	
	
	

	

	

	
	
	
	
}
