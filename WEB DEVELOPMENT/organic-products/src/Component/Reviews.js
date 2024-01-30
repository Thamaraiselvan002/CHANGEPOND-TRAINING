import React from 'react';
import { Carousel } from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css'; // Make sure you have imported Bootstrap CSS
import natural from '../Images/naturalscrub.png';
import bodylosion from '../Images/bodylosion.png';
import hairoil from '../Images/herbalhairoil.png';
import nuts from '../Images/herbalnuts.jpg';
import shampo from '../Images/herbalshampo.png';
import nutrition from '../Images/nutrition.jpg';

// Your component
const MyCarousel = () => {

  return (
    <Carousel className="carousel">
      <Carousel.Item interval={400}>
        <img src={natural} alt="Notebook" style={{ width: "1000px", textAlign: 'left', height: "300px", borderRadius: '20px 0px 0px 20px' }} />
        <Carousel.Caption>
          <h3 className='text-dark'>natural scrub</h3>
          <p>its is the </p>
        </Carousel.Caption>
      </Carousel.Item>
      <Carousel.Item interval={300}>
        <img src={nutrition} alt="Notebook" style={{ width: "1000px", textAlign: 'left', height: "300px", borderRadius: '20px 0px 0px 20px' }} />
        <Carousel.Caption>
          <h3>Second slide label</h3>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
        </Carousel.Caption>
      </Carousel.Item>
      <Carousel.Item interval={20}>
        <img src={nuts} alt="Notebook" style={{ width: "1000px", textAlign: 'left', height: "300px", borderRadius: '20px 0px 0px 20px' }} />
        <Carousel.Caption>
          <h3>Third slide label</h3>
          <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur.</p>
        </Carousel.Caption>
      </Carousel.Item>
    </Carousel>
  );
};

export default MyCarousel;
