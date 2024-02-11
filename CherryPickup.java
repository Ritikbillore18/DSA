// Cherry Pickup II

class CherryPickup {
    final int[][] moves={{-1,-1},{-1,0},{-1,1},{0,-1},{0,0},{0,1},{1,-1},{1,0},{1,1}};
    public int cherryPickup(int[][] grid) {
        return collectCherries(grid,0,0,0,grid[0].length-1);
    }
    private int collectCherries(int[][] grid,int x1,int y1,int x2,int y2){
        if(x1==grid.length-1){
            return grid[x1][y1]+grid[x2][y2];
        }
        int ans=0;
        for(int i=0;i<9;i++){
            if(isInvalid(grid,y1+moves[i][0])||isInvalid(grid,y2+moves[i][1]))
                continue;
            if(y1+moves[i][0]==y2+moves[i][1])
                continue;
            ans=Math.max(ans,collectCherries(grid,x1+1,y1+moves[i][0],x2+1,y2+moves[i][1]));
        }
        ans=ans+grid[x1][y1]+grid[x2][y2];
        return ans;
    }
    private boolean isInvalid(int[][] grid,int y){
        return !(y>=0&&y<grid[0].length);
    }
}