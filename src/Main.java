import model.Model;
import view.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();

        model.getAllUsers(view.getUsers());
        model.getUsersId(view.getUsers(), 2);
    }
}