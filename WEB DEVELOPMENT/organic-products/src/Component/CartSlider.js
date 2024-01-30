import React from 'react'
import 'bootstrap/dist/css/bootstrap.min.css';
import Carousel from 'react-multi-carousel';
import 'react-multi-carousel/lib/styles.css';

const CartSlider = () => {

    const responsive = {
        desktop: {
          breakpoint: { max: 3000, min: 1024 },
          items: 3,
          slidesToSlide: 3 // optional, default to 1.
        },
        tablet: {
          breakpoint: { max: 1024, min: 464 },
          items: 2,
          slidesToSlide: 2 // optional, default to 1.
        },
        mobile: {
          breakpoint: { max: 464, min: 0 },
          items: 1,
          slidesToSlide: 1 // optional, default to 1.
        }
      }
    return (
        <div>
            <h1 className='text-center text-success my-1'>Our Reviews</h1>
            <div className='container'>
            <Carousel 
             swipeable={false}
             draggable={false}
             showDots={true}
             responsive={responsive}
             infinite={true}
             autoPlaySpeed={10}
             keyBoardControl={true}
             containerClass="carousel-container"
             removeArrowOnDeviceType={["tablet", "mobile"]}
             dotListClass="custom-dot-list-style"
             itemClass="carousel-item-padding-40-px"
            >
                        <div class="card" >
                            <img src="https://images.pexels.com/photos/179912/pexels-photo-179912.jpeg?auto=compress&cs=tinysrgb&w=400" class="card-img-top" alt="..." />
                            <div class="card-body">
                                <h5 class="card-title">organic Natural</h5>
                                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                <a href="#" class="btn btn-primary">Read More</a>
                            </div>
                        </div>
                        <div class="card" >
                            <img src="https://images.pexels.com/photos/7771998/pexels-photo-7771998.jpeg?auto=compress&cs=tinysrgb&w=400" class="card-img-top" alt="..." />
                            <div class="card-body">
                                <h5 class="card-title">Card title</h5>
                                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                <a href="#" class="btn btn-primary">Read More</a>
                            </div>
                        </div>
                        <div class="card" >
                            <img src="https://images.pexels.com/photos/1556707/pexels-photo-1556707.jpeg?auto=compress&cs=tinysrgb&w=400/" class="card-img-top" alt="..." />
                            <div class="card-body">
                                <h5 class="card-title">Card title</h5>
                                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                <a href="#" class="btn btn-primary">Read More</a>
                            </div>
                        </div>
                        <div class="card" >
                            <img src="https://images.pexels.com/photos/4021868/pexels-photo-4021868.jpeg?auto=compress&cs=tinysrgb&w=400/" class="card-img-top" alt="..." />
                            <div class="card-body">
                                <h5 class="card-title">Card title</h5>
                                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                <a href="#" class="btn btn-primary">Read More</a>
                            </div>
                        </div>
                </Carousel>
            </div>
        </div>
    )
}

export default CartSlider
