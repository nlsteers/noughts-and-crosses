package gui;


import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import logic.Façade;
/**
*
* @author Nathaniel
*/
public class Frame extends javax.swing.JFrame {
  Façade game = new Façade();
  boolean gameOver = false; 
  boolean move = true;
  
 
  
    public Frame() {
        initComponents();
        setLocation(100, 100);
        setSize(600, 600);
    }
     
    /**
* This method is called from within the constructor to initialize the form.
* WARNING: Do NOT modify this code. The content of this method is always
* regenerated by the Form Editor.
*/
    @SuppressWarnings("unchecked")

    private void initComponents() {

        controlPanel = new javax.swing.JPanel();
        scorePanel = new javax.swing.JPanel();
        playerOne = new javax.swing.JLabel();
        scoreOne = new javax.swing.JLabel();
        playerTwo = new javax.swing.JLabel();
        scoreTwo = new javax.swing.JLabel();
        emptyPanel = new javax.swing.JPanel();
      
        newButtonPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        newGame = new javax.swing.JButton();
        gamePanel = new javax.swing.JPanel();
        grid11 = new javax.swing.JLabel();
        grid12 = new javax.swing.JLabel();
        grid13 = new javax.swing.JLabel();
        grid21 = new javax.swing.JLabel();
        grid22 = new javax.swing.JLabel();
        grid23 = new javax.swing.JLabel();
        grid31 = new javax.swing.JLabel();
        grid32 = new javax.swing.JLabel();
        grid33 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agent Frame");
        setMinimumSize(new java.awt.Dimension(550, 580));
        setResizable(false);

        controlPanel.setLayout(new java.awt.BorderLayout());

        scorePanel.setBackground(new java.awt.Color(225, 225, 225));
        scorePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Scores:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(50, 50, 50))); // NOI18N
        scorePanel.setLayout(new java.awt.GridLayout(2, 2));

        scorePanel.add(playerOne);

        scoreOne.setFont(new java.awt.Font("Tahoma", 0, 24));
        scoreOne.setForeground(new java.awt.Color(0, 0, 0));
        scoreOne.setText("0");
        scorePanel.add(scoreOne);

        scorePanel.add(playerTwo);

        scoreTwo.setFont(new java.awt.Font("Tahoma", 0, 24)); 
        scoreTwo.setForeground(new java.awt.Color(0, 0, 0));
        scoreTwo.setText("0");
        scorePanel.add(scoreTwo);

        controlPanel.add(scorePanel, java.awt.BorderLayout.NORTH);

        emptyPanel.setBackground(new java.awt.Color(225,225,225));
        emptyPanel.setLayout(new java.awt.GridLayout(1, 0));

       
       

        controlPanel.add(emptyPanel, java.awt.BorderLayout.CENTER);

        newButtonPanel.setBackground(new java.awt.Color(225, 225, 225));
        newButtonPanel.setForeground(new java.awt.Color(225, 225, 225));
        newButtonPanel.setLayout(new java.awt.GridLayout(4, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        
       
        newButtonPanel.add(jLabel2);

        newGame.setFont(new java.awt.Font("Tahoma", 0, 18));
        newGame.setText("New Game");
        newGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newGameMouseClicked(evt);
            }
        });
        newButtonPanel.add(newGame);

        controlPanel.add(newButtonPanel, java.awt.BorderLayout.SOUTH);

        getContentPane().add(controlPanel, java.awt.BorderLayout.EAST);

        gamePanel.setBackground(new java.awt.Color(225, 225, 225));
        gamePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225)));
        gamePanel.setLayout(new java.awt.GridLayout(3, 3));

        grid11.setFont(new java.awt.Font("Tahoma", 0, 48));
        grid11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grid11.setText(" ");
        grid11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 50, 50), 1, true));
        grid11.setName("grid11");
        grid11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid11MouseClicked(evt);
            }
        });
        gamePanel.add(grid11);

        grid12.setFont(new java.awt.Font("Tahoma", 0, 48));
        grid12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grid12.setText(" ");
        grid12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 50, 50), 1, true));
        grid12.setName("grid12");  
        grid12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid11MouseClicked(evt);
            }
        });
        gamePanel.add(grid12);

        grid13.setFont(new java.awt.Font("Tahoma", 0, 48));
        grid13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grid13.setText(" ");
        grid13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 50, 50), 1, true));
        grid13.setName("grid13"); 
        grid13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid11MouseClicked(evt);
            }
        });
        gamePanel.add(grid13);

        grid21.setFont(new java.awt.Font("Tahoma", 0, 48));
        grid21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grid21.setText(" ");
        grid21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 50, 50), 1, true));
        grid21.setName("grid21");
        grid21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid11MouseClicked(evt);
            }
        });
        gamePanel.add(grid21);

        grid22.setFont(new java.awt.Font("Tahoma", 0, 48));
        grid22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grid22.setText(" ");
        grid22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 50, 50), 1, true));
        grid22.setName("grid22");
        grid22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid11MouseClicked(evt);
            }
        });
        gamePanel.add(grid22);

        grid23.setFont(new java.awt.Font("Tahoma", 0, 48));
        grid23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grid23.setText(" ");
        grid23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 50, 50), 1, true));
        grid23.setName("grid23");
        grid23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid11MouseClicked(evt);
            }
        });
        gamePanel.add(grid23);

        grid31.setFont(new java.awt.Font("Tahoma", 0, 48));
        grid31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grid31.setText(" ");
        grid31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 50, 50), 1, true));
        grid31.setName("grid31"); 
        grid31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid11MouseClicked(evt);
            }
        });
        gamePanel.add(grid31);

        grid32.setFont(new java.awt.Font("Tahoma", 0, 48));
        grid32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grid32.setText(" ");
        grid32.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 50, 50), 1, true));
        grid32.setName("grid32"); 
        grid32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid11MouseClicked(evt);
            }
        });
        gamePanel.add(grid32);

        grid33.setFont(new java.awt.Font("Tahoma", 0, 48));
        grid33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grid33.setText(" ");
        grid33.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 50, 50), 1, true));
        grid33.setName("grid33"); 
        grid33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid11MouseClicked(evt);
            }
        });
        gamePanel.add(grid33);

        getContentPane().add(gamePanel, java.awt.BorderLayout.CENTER);

        pack();
    }

    private void grid11MouseClicked(java.awt.event.MouseEvent evt) {
      Component c = evt.getComponent();
      if (c instanceof JLabel){ 
        if( ((JLabel)c).getIcon() == null && gameOver != true && move == true){
          if(game.go(((JLabel)c).getName())){
           ((JLabel)c).setText("X");
            
          }
        }
        else
        {
          return;
        }
      }
      gameOver(move);
      if(gameOver != true){
         move = false;
         Thread t = new Thread(){
          @Override
          public void run() {
            try {
              sleep(2000);
              agentTurn();
              gameOver(move);
              move = true;
             }
            catch (InterruptedException ex) {
              Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
         };
        t.start();
      }
    }

    private void agentTurn(){
      int[] location = new int[2];
            location = game.cpu();
      handleGridMouseClick(location[0], location[1]);
    }
    
    private void handleGridMouseClick( int row, int column )
    {
      
      JLabel label = getLabel( row + 1, column + 1 );
             label.setText("O");
             
             
      }
    
    private JLabel getLabel(int row, int column){
      JLabel location = null;
      String match = "grid" + Integer.toString(row) + Integer.toString(column);
      int length = gamePanel.getComponents().length;
      Component[] cells = new Component[length];
      cells = gamePanel.getComponents();
      for(int i = 0; i < length; i++){
       if(((JLabel)cells[i]).getName().equals(match)){
         location = ((JLabel)cells[i]);
       }
      }
      return location;
    }
    
    private void newGameMouseClicked(java.awt.event.MouseEvent evt) {
     newGame();

    }

    private void showWin(){
      String[] win = game.winingMove();
      JLabel match;
      for(int i = 0; i < win.length; i++){
        match = getLabel(Integer.parseInt(String.valueOf(win[i].charAt(0))) , Integer.parseInt(String.valueOf(win[i].charAt(1))));
        match.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 20, 0), 3, true));
      }
    }
            
    private void newGame() {
     game.newGame();
     gameOver = false;
     
     
     int comps = gamePanel.getComponents().length;
     for(int i = 0; i < comps; i++ )
     {
      Component toChange = gamePanel.getComponent(i);
      ((JLabel)toChange).setText(" ");
      ((JLabel)toChange).setBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 50, 50), 1, true));
      ((JLabel)toChange).setIcon(null);
     }
    }
    
   
    
    private void gameOver(boolean winner){
      int store;
      if(game.gameOver()){
        if(game.win()){
          showWin();
          if(winner){
            store = Integer.parseInt(scoreOne.getText());
            store++;
            scoreOne.setText(Integer.toString(store));
          }
          else
          {
            store = Integer.parseInt(scoreTwo.getText());
            store++;
            scoreTwo.setText(Integer.toString(store));
          }
        }
        
        gameOver = true;
      }
      else
      {
        gameOver = false;
      }
    }
    /**
* @param args the command line arguments
*/
    public static void main(String args[]) {
        /*
* Set the Nimbus look and feel
*/
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
* If Nimbus (introduced in Java SE 6) is not available, stay with the
* default look and feel. For details see
* http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
*/
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
* Create and display the form
*/
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Frame().setVisible(true);
                
            }
        });
    }
    
    private javax.swing.JPanel controlPanel;
    private javax.swing.JPanel emptyPanel;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JLabel grid11;
    private javax.swing.JLabel grid12;
    private javax.swing.JLabel grid13;
    private javax.swing.JLabel grid21;
    private javax.swing.JLabel grid22;
    private javax.swing.JLabel grid23;
    private javax.swing.JLabel grid31;
    private javax.swing.JLabel grid32;
    private javax.swing.JLabel grid33;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel newButtonPanel;
    private javax.swing.JButton newGame;
 
    private javax.swing.JLabel playerOne;
    private javax.swing.JLabel playerTwo;
    private javax.swing.JLabel scoreOne;
    private javax.swing.JPanel scorePanel;
    private javax.swing.JLabel scoreTwo;
    // End of variables declaration//GEN-END:variables
}


