const ListOfPlayers = ({title, players}) => {
    return (
        <div>
            <h2>{title}</h2>
            <ul>
                {
                    players.map((item) => 
                    <li key={item.name}>
                        Mr. {item.name} | score = {item.score}
                    </li>)
                }
            </ul>
            <hr/>
        </div>
    );
}

export default ListOfPlayers;