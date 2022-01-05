fs = require('fs');
os = require('os');
process = require('process');
var path = require('path');
var nodegit = require('nodegit');

let out = os.homedir() + "/Desktop/Programming/Java/ObsidianArmor/LATEST.txt"

data = {
        "version": process.argv[2],
        "mcVersion": "1.7.10-Forge-1614"
}

fs.writeFile(out, JSON.stringify(data), function(error) {
    if(error) console.log(error);
});