package observer;

public class Client {
 public static void main(String[] args) {
    
    VirtualMachine vm = new VirtualMachine();

    Admin admin = new Admin();
    Users users = new Users();

    vm.addObserver(users);
    vm.addObserver(admin);

    vm.setMemoryUsage(90);

 }   
}