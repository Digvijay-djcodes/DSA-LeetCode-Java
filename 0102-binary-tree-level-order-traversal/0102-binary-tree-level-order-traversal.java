/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer=new ArrayList<List<Integer>>();
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        if (root==null){
            return answer;
        }
        while(!q.isEmpty()){
            int s=q.size();
            List<Integer> templist=new ArrayList<Integer>();
            for(int i=0;i<s;i++){
                TreeNode temp=q.peek();
                q.remove();
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
                templist.add(temp.val);
        }
        answer.add(templist);
        
    }
    return answer;
}
}