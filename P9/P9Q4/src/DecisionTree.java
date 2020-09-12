
import java.io.Serializable;


public class DecisionTree<T> implements DecisionTreeInterface<T> {

    private Node root;
    private Node currentNode;
    
    public DecisionTree(){
        this.root = null;
    }
    
    public DecisionTree(final T rootData){
        this.root = new Node(rootData);
    }
    
     public DecisionTree(final T rootData, final T yesAnswer, final T noAnswer) {
        (this.root = new Node(rootData)).yes = new Node(yesAnswer);
        this.root.no = new Node(noAnswer);
    }
    
    @Override
    public T getRootData() {
        T rootData = null;
        if (this.root != null) {
            rootData = this.root.data;
        }
        return rootData;
    }

    protected void setRootData(final T rootData) {
        this.root.data = rootData;
    }
    
    @Override
    public boolean isEmpty() {
        return this.root == null;
    }

    @Override
    public void clear() {
        this.root = null;
    }

    @Override
    public T getCurrentData() {
        if (this.currentNode != null) {
            return this.currentNode.data;
        }
        return null;
    }

    @Override
    public void setCurrentData(T newData) {
        this.currentNode.data = newData;
    }

    @Override
    public void setAnswers(T answerForNo, T answerForYes) {
        //No
        if (this.currentNode.no != null) {
            final Node noChild = this.currentNode.no;
            noChild.data = answerForNo;
        }
        else {
            this.currentNode.no = new Node(answerForNo);
        }
        
        //Yes
        if (this.currentNode.yes != null) {
            final Node yesChild = this.currentNode.yes;
            yesChild.data = answerForYes;
        }
        else {
            this.currentNode.yes = new Node(answerForYes);
        }
    }

    @Override
    public boolean isAnswer() {
        return this.currentNode != null && this.currentNode.isLeaf();
    }

    @Override
    public void advanceToNo() {
        this.currentNode = this.currentNode.no;
    }

    @Override
    public void advanceToYes() {
        this.currentNode = this.currentNode.yes;
    }

    @Override
    public void reset() {
        this.currentNode = this.root;
    }
    
    
    private class Node implements Serializable
    {
        private T data;
        private Node yes;
        private Node no;

        private Node(final T data) {
            this.data = data;
            this.yes = null;
            this.no = null;
        }

        private Node(final T data, final Node yes, final Node no) {
            this.data = data;
            this.yes = yes;
            this.no = no;
        }

        private boolean isLeaf() {
            return this.yes == null && this.no == null;
        }
    }
}
