import React from "react";
import { View } from "react-native";
import { styles } from "./styles";
import PersonIcon from "../icons/PersonIcon";

function ProfilePhoto(): React.JSX.Element {
    return (
        <View style={styles.holder}>
            <PersonIcon />
        </View>
    );
}

export default ProfilePhoto;