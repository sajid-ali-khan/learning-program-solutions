import './App.css';
import Player from './Models/Player'
import ListOfPlayers from './Components/ListOfPlayers';

function App() {
  const players = [
    new Player('AB De Villiers', 79, 'SA'),
    new Player('Virat Kohli', 112, 'IN'),
    new Player('MS Dhoni', 29, 'IN'),
    new Player('Jos Buttler', 100, 'EN'),
    new Player('Chris Gayle', 175, 'WE'),
    new Player('Kane Williamson', 80, 'NZ'),
    new Player('Chris Morris', 51, 'SA')
  ];

  return (
    <>
      <ListOfPlayers
        title='List of All Players'
        players={players} />
      <ListOfPlayers
        title='Players with score > 70'
        players={scoreAbove70(players)} />
      <ListOfPlayers
        title='Indian Players'
        players={indianPlayers(players)} />
    </>
  );
}

function scoreAbove70(players) {
  return players.filter((item) => item.score >= 70);
}

function indianPlayers(players) {
  return players.filter((item) => item.nation === 'IN')
}

export default App;
