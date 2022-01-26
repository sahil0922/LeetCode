//time complexity : O(m + n) n,m are nodes in tree1 and tree2
//Inorder of BST is sorted list

public void getAllHelper(TreeNode root, List<Integer> list){
        if(root == null) return;
        
        getAllHelper(root.left, list);
        list.add(root.val);
        getAllHelper(root.right, list);
    }
    
    public void mergeTwoList(List<Integer> list1, List<Integer> list2, List<Integer> myList){
        int i = 0;
        int j = 0;
        
        while(i < list1.size() && j < list2.size()){
            int val1 = list1.get(i);
            int val2 = list2.get(j);
            
            if(val1 < val2){
                myList.add(val1);
                i++;
            }else{
                myList.add(val2);
                j++;
            }
        }
        
        while(i < list1.size()){
            myList.add(list1.get(i));
            i++;
        }
        while(j < list2.size()){
            myList.add(list2.get(j));
            j++;
        }
        
    }
    
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> myList = new ArrayList<>();
        
        getAllHelper(root1,list1);
        getAllHelper(root2,list2);
        
        mergeTwoList(list1, list2, myList);
        return myList;
    }
