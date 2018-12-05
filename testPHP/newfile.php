<?php

if (isset($_REQUEST['SendB'])){
    
    /*if($_REQUEST['sexe']=='F')
     $civilite= "Madame";
     else
     $civilite = "Monsieur";
     */
     switch ($_REQUEST ['sexe']){
         case "F" :
             $civilite="Madame";
             break;
             
         case "M" :
             $civilite="Monsieur";
             break;
     }
     
     echo("Bonjour".$civilite." ".$_REQUEST['prenom']." ".$_REQUEST['nom']."<br/>");
     echo("Vous avez".$_REQUEST['age']."ans"."<br/>");
}
?>
