@connexion
Feature: Authentification - OrangeHRM
  En tant que utilisateur je souhaite m'authentifier

  @connexion
  Scenario Outline: Authentification - OrangeHRM
    Given Je me connecte sur l application OrangeHRM
    When Je saisie le login "<login>"
    And Je saisie le mot de passe "<password>"
    And Je clique sur login
    Then Redirection vers l accueil

    Examples: 
      | login | password |
      | Admin | admin123 |
      | Slim  | slim123  |
