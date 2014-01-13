(function() {
  var canvas, context, getMousePos, root;
  root = typeof exports !== "undefined" && exports !== null ? exports : this;
  root.paintStones = function(canvas, image, x, y, a, msg) {
    var i, _results;
    i = 0;
    _results = [];
    while (i < msg.amount) {
      i++;
      _results.push(a < 12 || a === 24 || a === 26 ? canvas.drawIII(image, x, y + i * 25) : canvas.drawIII(image, x, y - i * 25));
    }
    return _results;
  };
  root.getCoordinates = function(canvas, image, a, msg) {
    var xCoordinate, yCoordinate;
    xCoordinate = 645;
    if (a >= 6 && a < 18) {
      xCoordinate -= 2 * 30;
    } else {
      switch (a) {
        case 24:
          root.paintStones(canvas, image, 340, 35, a, msg);
          break;
        case 25:
          root.paintStones(canvas, image, 340, 575, a, msg);
          break;
        case 26:
          root.paintStones(canvas, image, 690, 35, a, msg);
          break;
        case 27:
          root.paintStones(canvas, image, 690, 575, a, msg);
      }
    }
    yCoordinate;
    if (a < 12) {
      yCoordinate = 35;
      xCoordinate -= a % 12 * 50;
      return root.paintStones(canvas, image, xCoordinate, yCoordinate, a, msg);
    } else if (a > 11 && a < 24) {
      yCoordinate = 565;
      xCoordinate -= (23 - a) % 12 * 50;
      return root.paintStones(canvas, image, xCoordinate, yCoordinate, a, msg);
    }
  };
  root.drawStones = function(canvas, msg) {
    var field, i, image, _len, _results;
    _results = [];
    for (i = 0, _len = msg.length; i < _len; i++) {
      field = msg[i];
      image;
      if (field.color === 0) {
        image = document.getElementById('stonew');
      } else {
        image = document.getElementById('stoneb');
      }
      _results.push(root.getCoordinates(canvas, image, i, field));
    }
    return _results;
  };
  root.drawDices = function(canvas, i, dice) {
    var diceX;
    diceX = 440 + i * 60;
    if (dice > 0) {
      return canvas.drawIII(document.getElementById('dice' + dice), diceX, 295);
    }
  };
  root.drawBackground = function(canvas) {
    var img;
    img = document.getElementById('background');
    return canvas.drawIII(img, 0, 0);
  };
  root.paintComponent = function(msg) {
    var c, canvas, state;
    console.log(msg);
    state = "" + msg.status;
    $("#status").html(state);
    c = document.getElementById('game');
    canvas = c.getContext('2d');
    canvas.drawIII = function(image, x, y) {
      return canvas.drawImage(image, x, y);
    };
    root.drawBackground(canvas);
    root.drawStones(canvas, msg.field);
    root.drawDices(canvas, 0, msg.dice.valuesToDraw[0]);
    root.drawDices(canvas, 1, msg.dice.valuesToDraw[1]);
    root.drawDices(canvas, 2, msg.dice.valuesToDraw[2]);
    return root.drawDices(canvas, 3, msg.dice.valuesToDraw[3]);
  };
  getMousePos = function(canvas, evt) {
    var rect;
    rect = canvas.getBoundingClientRect();
    return {
      x: evt.clientX - rect.left,
      y: evt.clientY - rect.top
    };
  };
  canvas = document.getElementById("game");
  context = canvas.getContext("2d");
  canvas.addEventListener("click", (function(evt) {
    var mousePos;
    mousePos = getMousePos(canvas, evt);
    mousePos["id"] = msg._id;
    return $.post("/json", mousePos, function(data) {
      return root.paintComponent(data);
    });
  }), false);
}).call(this);
