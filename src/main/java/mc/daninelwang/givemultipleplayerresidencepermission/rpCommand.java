package mc.daninelwang.givemultipleplayerresidencepermission;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Arrays;

public class rpCommand implements CommandExecutor {

    public static String[] flags = {"anvil",
            "admin",
            "animalkilling",
            "animals",
            "anvilbreak",
            "backup",
            "bank",
            "bed",
            "beacon",
            "brew",
            "build",
            "burn",
            "button",
            "cake",
            "canimals",
            "chorustp",
            "chat",
            "cmonsters",
            "commandblock",
            "command",
            "container",
            "coords",
            "craft",
            "creeper",
            "dragongrief",
            "day",
            "dye",
            "damage",
            "decay",
            "destroy",
            "dryup",
            "diode",
            "door",
            "egg",
            "enchant",
            "explode",
            "enderpearl",
            "fallinprotection",
            "falldamage",
            "feed",
            "friendlyfire",
            "fireball",
            "firespread",
            "flowinprotection",
            "flow",
            "flowerpot",
            "grow",
            "glow",
            "hotfloor",
            "hidden",
            "hook",
            "healing",
            "iceform",
            "icemelt",
            "ignite",
            "itemdrop",
            "itempickup",
            "jump2",
            "jump3",
            "keepinv",
            "keepexp",
            "lavaflow",
            "leash",
            "lever",
            "mobexpdrop",
            "mobitemdrop",
            "mobkilling",
            "monsters",
            "move",
            "nanimals",
            "nmonsters",
            "night",
            "nofly",
            "fly",
            "nomobs",
            "note",
            "nodurability",
            "overridepvp",
            "pressure",
            "piston",
            "pistonprotection",
            "place",
            "pvp",
            "rain",
            "redstone",
            "respawn",
            "riding",
            "shoot",
            "sun",
            "shop",
            "snowtrail",
            "spread",
            "snowball",
            "sanimals",
            "shear",
            "smonsters",
            "subzone",
            "title",
            "table",
            "tnt",
            "tp",
            "trade",
            "trample",
            "trusted",
            "use",
            "vehicledestroy",
            "witherspawn",
            "phantomspawn",
            "witherdamage",
            "witherdestruction",
            "waterflow",
            "wspeed1",
            "wspeed2"
    };


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){

            Player player = (Player) sender;

            if (args.length == 0 || args[1].equalsIgnoreCase("help")){

                player.sendMessage(ChatColor.GOLD + "---???????????????????????? ???????????????---");
                player.sendMessage(ChatColor.RED + "/rp <?????????> <?????????> <true/false/remove> <??????1> <??????2> ????????????????????????(??????????????????)");
                player.sendMessage(ChatColor.RED + "/rp <?????????> removeall <??????1> <??????2> <??????3> ????????????????????????????????????????????????");

            }else if(args[1].equalsIgnoreCase("removeall")){ //res pset <resID> <ID> removeall

                ArrayList<String> playerList = new ArrayList<>();

                for (int i = 2;i < args.length;i++){
                    playerList.add(args[i]);
                }

                for (String s : playerList){
                    player.performCommand("res pset " + args[0] + " " + s + " removeall");
                }

            }else if ((Arrays.asList(flags).contains(args[1])) &&
                    (args[2].equalsIgnoreCase("true") ||
                    args[2].equalsIgnoreCase("false") ||
                    args[2].equalsIgnoreCase("remove"))) { //res pset <resID> <ID> <flag> <true/false/remove>

                ArrayList<String> playerList = new ArrayList<>();

                for (int i = 3;i < args.length;i++){
                    playerList.add(args[i]);
                }

                for (String s : playerList){
                    player.performCommand("res pset " + args[0] + " " + s + " " + args[1] + " " + args[2]);
                }

            }
        }else {
            sender.sendMessage("You are not a player!");
        }


        return true;
    }
}
