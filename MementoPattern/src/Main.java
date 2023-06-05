public class Main {
    public static void main(String[] args) {

        // initialize document object
        Document document = new Document();
        // initialize history object
        history history = new history();

        // set content
        document.setContent("first content");
        //create state and push to history
        history.push(document.createState());

        document.setContent("second content");
        document.setFontName("normal");
        document.setFontSize("40px");

        // restore to old state
        document.restoreState(history.pop());

        document.setContent("third content");
        history.push(document.createState());

        System.out.println(document.getContent());
        System.out.println(document.getFontName());
        System.out.println(document.getFontsize());

    }
}