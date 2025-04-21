import React from 'react';
import { Text, View } from 'react-native';
import { styles } from './styles';
import BellIcon from '../icons/BellIcon';
import ProfilePhoto from '../ProfilePhoto';

function Header(): React.JSX.Element {

    const userName: string = "Guilherme";

    return (
        <View style={styles.header}>
            <BellIcon />
            <View style={styles.profileInformation}>
                <ProfilePhoto />
                <Text style={styles.userName}>
                    Olá, {userName}
                </Text>
            </View>
        </View>
    );
}

export default Header;
