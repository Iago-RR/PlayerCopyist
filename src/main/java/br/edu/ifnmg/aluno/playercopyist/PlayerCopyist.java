/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifnmg.aluno.playercopyist;
import io.github.guisso.meleeinterface.Decision;
import io.github.guisso.meleeinterface.IPlayer;
/**
 *
 * @author iagor
 */

public class PlayerCopyist
        implements IPlayer {

    private int is_first = 1;
    
    @Override
    public String getDeveloperName() {
        return "Iago Maia";
    }

    @Override
    public String getEngineName() {
        return "PlayerKakashi";
    }

    

    @Override
    public Decision makeMyMove(Decision opponentPreviousMove) {
        
        // Coopera na primeira jogada
        if(is_first == 1){
            is_first = 0;
            return Decision.COOPERATE;
        }
        
        // A partir da primeira, copia jogada do adversário
        if(opponentPreviousMove == Decision.COOPERATE){
            return Decision.COOPERATE;
        }
        else if(opponentPreviousMove == Decision.DEFECT){
            return Decision.DEFECT;
        }
        else{
            return Decision.COOPERATE; 
        } // else final em caso de erro para computar jogada da adv.
    
    
    }
       
}
