package BonzeeGame;


public enum BonzeeBoard {

    BOARD;


    private Object[][] board;

    BonzeeBoard(){
        this.init();
    }

    private void init(){
        this.board = new Object[11][7];                 // consider the label in each side, the total size of board is 11 * 7

        for (int i = 1; i < 10; i++){                   // label horizontal numbers
            this.board[0][i] = i;
            this.board[6][i] = i;
        }

        for (int i = 1; i < 6; i++){                    // label vertical alphabets
            this.board[i][0] = (char)('A' + (i - 1));
            this.board[i][10] = (char)('A' + (i - 1));
        }

        for (int i = 1; i < 6; i = i + 2){              // label cell colors in odd rows, new Cells

        }

        for (int i = 2; i < 6; i = i + 2){              // label cell colors in even rows, new Cells

        }
    }

    public Integer getUpVerBound(){                     // return up boundary of board
        return 1;
    }

    public Integer getDownBound(){                      // return down boundary of board
        return 5;
    }

    public Integer getLeftHoriBound(){                  // return left boundary of board
        return 1;
    }

    public Integer getRightHoriBound(){                 // return right boundary of board
        return 9;
    }



    public String toString(){                           // print current board
        return "";
    }

}
