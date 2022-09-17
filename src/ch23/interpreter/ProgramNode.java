package ch23.interpreter;

class ProgramNode extends Node {
    private Node commandListNode;

    @Override
    void parse(Context context) throws ParseException {
        context.skipToken("program");
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    @Override
    public String toString() {
        return "[program "+ commandListNode + "]";
    }
}
