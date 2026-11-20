import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int arr[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int delete = Integer.parseInt(br.readLine());
        int answer = 0;

        
        Node root = null;
        Node[] nodes = new Node[n];

        for(int i = 0; i < n; i++) {
            nodes[i] = new Node(i);
        }

        for(int i = 0; i < n; i++) {
            int parent = arr[i];
            if(parent == -1) {
                root = nodes[i];
            }
            else {
                nodes[parent].addChild(nodes[i]);
            }

        }

        if(delete == root.getValue()) {
            root = null;
        }
        else {
            root.removeNodeAt(delete);
            answer = root.getLeafNode();
        }

        bw.write(answer + "");
        bw.flush();
    }
}

class Node {
    Node(int value) {
        this.value = value;
    }

    private List<Node> children = new ArrayList<>();
    private int value;

    public List<Node> getChildren() {
        return children;
    }

    public int getValue() {
        return value;
    }

    public void addChild(Node node) {
        children.add(node);
    }

    public void removeNodeAt(int value) {
        Node node = this;
        Queue<Node> q = new LinkedList<>();

        q.offer(node);
        while(!q.isEmpty()) {
            node = q.poll();
            
            List<Node> childrenlist = node.getChildren();

            for(int i = 0; i < childrenlist.size(); i++) {
                Node n = childrenlist.get(i);
                if(n.getValue() == value) {
                    childrenlist.remove(i);
                    return;
                }

                q.offer(n);
            }
        }
    }

    public Node getNodeAt(int value) {
        Node node = this;
        Queue<Node> q = new LinkedList<>();

        q.offer(node);
        while(!q.isEmpty()) {
            node = q.poll();
            if(node.getValue() == value) break;
            
            for(Node n : node.getChildren()) {
                q.offer(n);
            }
        }
        return node;
    }

    public int getLeafNode() {
        int count = 0;
        Node node = this;
        Queue<Node> q = new LinkedList<>();

        q.offer(node);
        while(!q.isEmpty()) {
            node = q.poll();
            if(node.getChildren().isEmpty()) count++;
            
            for(Node n : node.getChildren()) {
                q.offer(n);
            }
        }

        return count;
    }
}
