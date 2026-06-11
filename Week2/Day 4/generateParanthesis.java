class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> bu = new ArrayList<>();
        build(bu, "", 0, 0, n);
        return bu;
    }
    private void build(List<String> bu,String trail,int leftCnt,int rightCnt,int limit) {
        if(trail.length() == limit * 2) {
            bu.add(trail);
            return;
        }
        if(leftCnt < limit) {
            build(bu, trail + "(",leftCnt + 1,rightCnt, limit);
        }
        if(rightCnt < leftCnt) {
            build(bu,trail + ")",leftCnt,rightCnt + 1, limit);
        }
    }
}
