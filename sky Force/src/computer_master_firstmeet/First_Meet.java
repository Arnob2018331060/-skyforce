package computer_master_firstmeet;
import java.io.FileInputStream;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class First_Meet extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    static boolean answer;
    Scene scene1,scene2,scene3,scene4,scene5;

    @Override
    public void start(Stage primaryStage) throws Exception {
        //All Button Create
        Button st = new Button("Start Game");
        Button op = new Button("Option");
        Button set = new Button("Setting");
        Button ex = new Button("Exit");
        st.setOnAction(e-> primaryStage.setScene(scene2));
        ex.setOnAction(e->primaryStage.setScene(scene5));
        set.setOnAction(e-> primaryStage.setScene(scene3));
        VBox root1 = new VBox();
        root1.getChildren().addAll(st,op,set,ex);
        root1.setAlignment(Pos.CENTER);
        scene1 = new Scene(root1,500,400);
     
        Image img = new Image(new FileInputStream("C:\\Users\\Shohid\\Pictures\\Debut"));
        ImageView iv = new ImageView(img);
        Group root2 = new Group();
        root2.getChildren().add(iv);
        scene2 = new Scene(root2);
        Button so = new Button("Sound");
        so.setOnAction(e->primaryStage.setScene(scene4));
        Button bk = new Button("Back");
        bk.setOnAction(e->primaryStage.setScene(scene1));
        VBox root3 = new VBox();
        root3.getChildren().addAll(so,bk);
        scene3 = new Scene(root3,300,200);
        Button on = new Button("ON");
        Button of = new Button("OFF");
        on.setOnAction(e->primaryStage.setScene(scene1));
        of.setOnAction(e->primaryStage.setScene(scene1));
        FlowPane fl = new FlowPane();
        fl.getChildren().addAll(on,of);
        scene4 = new Scene(fl,300,200);
        Button yes = new Button("YES");
        Button no = new Button("NO");
        yes.setOnAction(e-> System.exit(0));
        no.setOnAction(e->primaryStage.setScene(scene1));
        FlowPane flw = new FlowPane();
        flw.getChildren().addAll(yes,no);
        flw.setAlignment(Pos.CENTER);
        scene5 = new Scene(flw,300,100);
        primaryStage.setScene(scene1);
        primaryStage.show();
         

        
       
    }
    
    
}