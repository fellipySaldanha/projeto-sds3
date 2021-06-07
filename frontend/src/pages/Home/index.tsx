import Footer from 'components/Footer';
import NavBar from 'components/NavBar';
import { Link } from 'react-router-dom';
function Home() {
    return (
        <>
            <NavBar/>
            <div className="container">
                <div className="jumbotron">
                    <h1 className="display-4">DS Vendas</h1>
                    <p className="lead">This is a simple hero unit, a simple jumbotron-style component for calling extra attention to featured content or information.</p>
                    <hr/>
                    <Link className="btn btn-primary btn-lg" to="/dashboard">
                        Acessar
                    </Link>
                </div>
            </div>
            <Footer/>
        </>
    );
}

export default Home;
