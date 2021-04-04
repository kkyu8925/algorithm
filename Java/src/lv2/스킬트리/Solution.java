package lv2.스킬트리;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String skill_tree : skill_trees) {
            skill_tree = skill_tree.replaceAll("[^"+skill+"]", "");
        }
        return answer;
    }

    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        Solution s = new Solution();
        s.solution(skill, skill_trees);
    }
}
