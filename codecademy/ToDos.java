package codecademy;

import java.util.ArrayList;

public class ToDos {
    ArrayList<String> Todos;

    public ToDos() {

    }
    public ToDos getLongerTodos(ToDos a, ToDos b) {
        if (a.Todos.size() > b.Todos.size()) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        ToDos sherlocksTodos = new ToDos();

        sherlocksTodos.Todos.add("visit the crime scene");
        sherlocksTodos.Todos.add("play violin");
        sherlocksTodos.Todos.add("interview suspects");
        sherlocksTodos.Todos.add("solve the case");
        sherlocksTodos.Todos.add("apprehend the criminal");

        ToDos poirotsTodos = new ToDos();

        poirotsTodos.Todos.add("visit the crime scene");
        poirotsTodos.Todos.add("interview suspects");
        poirotsTodos.Todos.add("let the little grey cells do their work");
        poirotsTodos.Todos.add("trim mustache");
        poirotsTodos.Todos.add("call all suspects together");
        poirotsTodos.Todos.add("reveal the truth of the crime");

        System.out.println(sherlocksTodos.getLongerTodos(sherlocksTodos, poirotsTodos));
    }
}
