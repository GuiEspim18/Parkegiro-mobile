import React from "react";
import { ImageBackground, View } from "react-native";
import { Image } from "react-native-svg";
import { styles } from "./styles";
import { transparentWhite } from "../../utils/colors";

type Props = {
    color?: string
}

function Blur({ color }: Props): React.JSX.Element {

    const backgroundColor: string = color && color.length > 0 ? color : transparentWhite;

    return (
        <></>
    );
}

export default Blur;