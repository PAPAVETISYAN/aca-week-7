package movie;

import java.util.Scanner;

public class Controller implements MovieService{
    public Controller() {
    }
    MoveRequest moveRequest = new MoveRequest();

    void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1 addMovie");
        System.out.println("enter 2 readAll");
        System.out.println("enter 3 readId");
        System.out.println("enter 4 update");
        System.out.println("enter 5 delete");
        int k = scanner.nextInt();
        switch (k){
            case 1:
                addMovie();
                break;
            case 2:
                readAll();
                break;
            case 3:
                System.out.print("enter id : ");
                readId(scanner.nextInt());
                break;
            case 4:
                System.out.print("enter id for update : ");
                update(scanner.nextInt());
                break;
            case 5:
                System.out.print("enter id for delete : ");
                delete(scanner.nextInt());
                break;
        }
    }

    public void addMovie() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Name : ");
        String name = scanner.next();
        System.out.println("AuthorName : ");
        String authorName = scanner.next();
        System.out.print("Rating : ");
        int rating = scanner.nextInt();
        moveRequest.authorName = authorName;
        moveRequest.name = name;
        moveRequest.rating = rating;
        Service service = new Service();
        service.create(moveRequest);

    }

    @Override
    public void readAll() {
        Service service = new Service();
        service.readAll();
    }

    @Override
    public void readId(int id) {
        Service service = new Service();
        service.readId(id);
    }

    @Override
    public void update(int id) {

    }

    @Override
    public void delete(int id) {
        Service service = new Service();
        service.delete(id);
    }
}
