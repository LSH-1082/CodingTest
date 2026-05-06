class Solution {
    public int solution(String[][] board, int h, int w) {
        String nowTileColor = board[h][w];
        int[][] neighborTile = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int answer = 0;

        if(board.length == 1 && board[0].length == 1) return answer;

        for(int i = 0; i < 4; i++) {
            int height = h + neighborTile[i][0];
            int width = w + neighborTile[i][1];
            boolean isValidHeight = height >= 0 && height < board.length;
            boolean isValidWidth = width >= 0 && width < board[0].length;
            
            if(!(isValidHeight && isValidWidth)) continue;
            if(nowTileColor.equals(board[height][width])) answer++;
        }

        return answer;
    }
}