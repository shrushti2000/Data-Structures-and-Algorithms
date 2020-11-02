public class BinarySearchTree{
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
   
    public Node root=null;
    public BinarySearchTree(){
        root=null;
    }
     
    void insert(int data){
        Node new_node=new Node(data);
        if(root==null){
            root=new_node;
            return;
        }
        else{
            Node current=root;
            Node parent;
            while(true){
                parent=current;
                if(data<current.data){
                    current=current.left;
                    if(current==null){
                        parent.left=new_node;
                        return;
                    }
                }else{
                    current=current.right;
                    if(current==null){
                        parent.right=new_node;
                        return;
                    }
                }
            }
        }
    }
    Node minNode(Node root){
        if(root.left!=null){
            return minNode(root.left);
        }else{
            return root;
        }
    }
    Node deleteNode(Node node,int value){
        if(node==null){
            return null;
        }else{
            if(value<node.data){
                node.left=deleteNode(node.left,value);
            }else if(value>node.data){
                node.right=deleteNode(node.right,value);
            }else{
                if(node.left==null && node.right==null){
                    node =null;
                }else if(node.left==null){
                    node=node.right;
                }else if(node.right==null){
                    node=node.left;
                }else{
                    Node temp=minNode(node.right);
                    node.data=temp.data;
                    node.right=deleteNode(node.right,temp.data);
                }
            }
            return node;
        }
        
    }
    void inorder(Node root){
        if(root==null){
            return;
        }else{
            inorder(root.left);
            System.out.print(" "+root.data);
            inorder(root.right);
        }
    }

    public static void main (String args[]){
        BinarySearchTree bst=new BinarySearchTree();
        bst.insert(90);  
        bst.insert(60);  
        bst.insert(100);  
        bst.insert(50);  
        bst.insert(65);  
        bst.insert(110);
         bst.insert(55);
          bst.insert(40);
           bst.insert(45);
            bst.insert(30); 
             bst.insert(52);
              bst.insert(58);
               bst.insert(64);
                bst.insert(68); 
                System.out.println("Inorder traversal");
                bst.inorder(bst.root);
                Node deletedNode=null;
                deletedNode=bst.deleteNode(bst.root,55);
                System.out.println("Inorder traversal after deleteing 50");
                bst.inorder(bst.root);


    }
}
