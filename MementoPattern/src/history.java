import java.util.List;
import java.util.ArrayList;

public class history {

    private List<DocumentState> history = new ArrayList<>();

    //push the document history to list
    public void push(DocumentState contentState){
        this.history.add(contentState);
    }

    // pop the previous state from the history list
    public DocumentState pop(){
        if(this.history.size() > 0){
            var lastHistoryIndex = this.history.size() - 1;
            var lastHistory = this.history.get(lastHistoryIndex);
            this.history.remove(lastHistory);
            return lastHistory;
        }
        else {
            return new Document().createState();
        }
    }
}
