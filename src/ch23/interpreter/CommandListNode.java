package ch23.interpreter;

import java.util.ArrayList;
import java.util.List;

class CommandListNode extends Node {
    private List<Node> nodes = new ArrayList<>();
    @Override
    void parse(Context context) throws ParseException {
        while(true){
            if(context.currentToken() == null){
                throw new ParseException("Missing end");
            }else if(context.currentToken().equals("end")){
                context.skipToken("end");
                break;
            }else{
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                nodes.add(commandNode);
            }
        }
    }

    @Override
    public String toString() {
        return "" + nodes;
    }
}
