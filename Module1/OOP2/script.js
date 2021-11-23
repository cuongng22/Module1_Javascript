class Hero {
    image
    top
    left
    size
    speed
    constructor(image,top,left,size,speed) {
        this.image=image
        this.top=top
        this.left=left
        this.size=size
        this.speed=speed
    }
    getHeroElement() {
        return '<img width="' + this.size + '"' +
            ' height="' + this.size + '"' +
            ' src="' + this.image + '"' +
            ' style="top: ' + this.top + 'px; left:' + this.left + 'px;position:absolute;" />';
    }
    moveRight() {
        return this.left+=this.speed
    }
    moveDown() {
       return  this.top+=this.speed
    }
    moveLeft() {
       return  this.left-=this.speed
    }
    moveUp() {
       return  this.top-=this.speed
    }
}
let sp=+prompt("sp")
let hero=new Hero("https://media-cdn.laodong.vn/Storage/NewsPortal/2021/10/30/969136/Cristiano-Ronaldo4.jpg",0,0,100,sp)
function start() {

    if(hero.left < (window.innerWidth - hero.size)&& hero.top===0) {
        hero.moveRight();
    } else {
        if (hero.top < (window.innerHeight - hero.size) && hero.left > 0) {
            hero.moveDown();
        } else if (hero.left > 0) {
            hero.moveLeft()
        } else if (hero.top > 0) {
            hero.moveUp()
        }
    }

    document.getElementById('game').innerHTML = hero.getHeroElement();
    setTimeout(start, 50)
}
start()