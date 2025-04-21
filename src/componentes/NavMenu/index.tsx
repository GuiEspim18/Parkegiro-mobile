import React from "react";
import { View } from "react-native";
import { styles } from "./styles";
import Blur from "../Blur";
import IconButton from "../buttons/IconButton";
import HomeIcon from "../icons/HomeIcon";
import { darkBlue2 } from "../../utils/colors";
import CarIcon from "../icons/CarIcon";

function NavMenu(): React.JSX.Element {
    return (
        <View style={styles.navMenu}>
            <View style={styles.navContent}>
                <IconButton routeName="Home">
                    <HomeIcon color={darkBlue2}/>
                </IconButton>
                <IconButton routeName="ParkingLot" params={{ userId: 1, name: "guilherme" }}>
                    <CarIcon color={darkBlue2}/>
                </IconButton>
            </View>
        </View>
    )
}

export default NavMenu;