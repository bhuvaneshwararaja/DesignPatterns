public class Document {
    private String content;
    private String fontName;
    private String fontsize;

    public Document() {
        this.content = "";
        this.fontName = "Arial";
        this.fontsize = "10px";
    }


    public String getContent() {
        return content;
    }

    public String getFontName() {
        return fontName;
    }

    public String getFontsize() {
        return fontsize;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public void setFontSize(String fontsize) {
        this.fontsize = fontsize;
    }

    // create document state with current state
    public DocumentState createState(){
        return new DocumentState(this.content,this.fontName,this.fontsize);
    }

    // restore document with previous state
    public void restoreState(DocumentState currentDocState){
            this.content = currentDocState.getContentSate();
            this.fontName = currentDocState.getFontNameState();
            this.fontsize = currentDocState.getFontSizeState();
    }




}
