public class DocumentState {


    private String contentSate;
    private String fontNameState;
    private String fontSizeState;

    public String getContentSate() {
        return contentSate;
    }

    public String getFontNameState() {
        return fontNameState;
    }

    public String getFontSizeState() {
        return fontSizeState;
    }

    // initialize the document current state
    public DocumentState(String content,String fontName,String fontSize) {
        this.contentSate = content;
        this.fontNameState = fontName;
        this.fontSizeState = fontSize;
    }




}
